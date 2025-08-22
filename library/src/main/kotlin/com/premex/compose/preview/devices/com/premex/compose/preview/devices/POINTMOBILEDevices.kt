package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * POINTMOBILE device specifications for Android Compose previews.
 *
 * This extension provides POINTMOBILE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.POINTMOBILE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.POINTMOBILE: Any
  get() = object {
      /** DeviceSpec(manufacturer=POINTMOBILE, code=pm30, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POINTMOBILE, code=pm30, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PM30 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POINTMOBILE, code=PM351, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POINTMOBILE, code=PM351, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PM351 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=POINTMOBILE, code=PM352, width=480, height=800, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POINTMOBILE, code=PM352, width=480,
      height=800, dpi=200, isGoogleDevice=false).code */
      val PM352 = "spec:width=480,height=800,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=POINTMOBILE, code=pm45, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POINTMOBILE, code=pm45, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PM45 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=POINTMOBILE, code=PM451, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POINTMOBILE, code=PM451, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PM451 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=POINTMOBILE, code=PM452, width=480, height=800, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POINTMOBILE, code=PM452, width=480,
      height=800, dpi=200, isGoogleDevice=false).code */
      val PM452 = "spec:width=480,height=800,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=POINTMOBILE, code=pm550, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POINTMOBILE, code=pm550, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PM550 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=POINTMOBILE, code=pm66, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POINTMOBILE, code=pm66, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PM66 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=POINTMOBILE, code=PM67, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POINTMOBILE, code=PM67, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val PM67 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=POINTMOBILE, code=PM75, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POINTMOBILE, code=PM75, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val PM75 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POINTMOBILE, code=pm80, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POINTMOBILE, code=pm80, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PM80 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POINTMOBILE, code=PM84, width=720, height=1440, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POINTMOBILE, code=PM84, width=720,
      height=1440, dpi=280, isGoogleDevice=false).code */
      val PM84 = "spec:width=720,height=1440,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=POINTMOBILE, code=pm85, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POINTMOBILE, code=pm85, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val PM85 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=POINTMOBILE, code=PM86, width=1080, height=1920, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POINTMOBILE, code=PM86, width=1080,
      height=1920, dpi=440, isGoogleDevice=false).code */
      val PM86 = "spec:width=1080,height=1920,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=POINTMOBILE, code=pm90, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POINTMOBILE, code=pm90, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PM90 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POINTMOBILE, code=PM95, width=1080, height=2160, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POINTMOBILE, code=PM95, width=1080,
      height=2160, dpi=400, isGoogleDevice=false).code */
      val PM95 = "spec:width=1080,height=2160,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=POINTMOBILE, code=PT11, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POINTMOBILE, code=PT11, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val PT11 = "spec:width=1200,height=2000,unit=px,dpi=240"

  }

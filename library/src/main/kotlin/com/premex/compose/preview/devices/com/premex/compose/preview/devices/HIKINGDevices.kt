package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HIKING device specifications for Android Compose previews.
 *
 * This extension provides HIKING device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HIKING.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HIKING: Any
  get() = object {
      /** DeviceSpec(manufacturer=HIKING, code=A19, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HIKING, code=A19, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val A19 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HIKING, code=A20, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HIKING, code=A20, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val A20 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=HIKING, code=A21, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HIKING, code=A21, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val A21 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HIKING, code=A22, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HIKING, code=A22, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val A22 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HIKING, code=A23, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HIKING, code=A23, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val A23 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HIKING, code=A26, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HIKING, code=A26, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val A26 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HIKING, code=A27, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HIKING, code=A27, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val A27 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HIKING, code=A28, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HIKING, code=A28, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val A28 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HIKING, code=A30, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HIKING, code=A30, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val A30 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=HIKING, code=A40, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HIKING, code=A40, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A40 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HIKING, code=A42, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HIKING, code=A42, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A42 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HIKING, code=A45, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HIKING, code=A45, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A45 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HIKING, code=A55, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HIKING, code=A55, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val A55 = "spec:width=720,height=1600,unit=px,dpi=320"

  }

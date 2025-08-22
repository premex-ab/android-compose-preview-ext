package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Umx device specifications for Android Compose previews.
 *
 * This extension provides Umx device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Umx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Umx: Any
  get() = object {
      /** DeviceSpec(manufacturer=Umx, code=U2VR, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Umx, code=U2VR, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val U2VR = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Umx, code=U2-PLUS-TE-VR, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Umx, code=U2-PLUS-TE-VR,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val U2_PLUS_TE_VR = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Umx, code=U3AR, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Umx, code=U3AR, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val U3AR = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Umx, code=U504TL, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Umx, code=U504TL, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val U504TL = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Umx, code=U673C, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Umx, code=U673C, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val U673C = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Umx, code=U683CL, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Umx, code=U683CL, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val U683CL = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Umx, code=U693CL, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Umx, code=U693CL, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val U693CL = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Umx, code=U696CL, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Umx, code=U696CL, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val U696CL = "spec:width=720,height=1560,unit=px,dpi=320"

  }

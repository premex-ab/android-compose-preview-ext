package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CROSSCALL device specifications for Android Compose previews.
 *
 * This extension provides CROSSCALL device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CROSSCALL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CROSSCALL: Any
  get() = object {
      /** DeviceSpec(manufacturer=CROSSCALL, code=CORE-M4, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CROSSCALL, code=CORE-M4, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val CORE_M4 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CROSSCALL, code=CORE-M4-GO, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CROSSCALL, code=CORE-M4-GO,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val CORE_M4_GO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CROSSCALL, code=HS8917QC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CROSSCALL, code=HS8917QC,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val HS8917QC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CROSSCALL, code=HS8937QC, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CROSSCALL, code=HS8937QC,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val HS8937QC = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CROSSCALL, code=HS8952QC, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CROSSCALL, code=HS8952QC,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val HS8952QC = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=CROSSCALL, code=HSSDM660QC, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CROSSCALL, code=HSSDM660QC,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val HSSDM660QC = "spec:width=1080,height=1920,unit=px,dpi=480"

  }

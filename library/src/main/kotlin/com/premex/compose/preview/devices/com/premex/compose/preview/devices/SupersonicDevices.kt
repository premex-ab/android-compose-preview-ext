package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Supersonic device specifications for Android Compose previews.
 *
 * This extension provides Supersonic device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Supersonic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Supersonic: Any
  get() = object {
      /** DeviceSpec(manufacturer=Supersonic, code=SC_1010JBBT, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Supersonic, code=SC_1010JBBT,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SC_1010JBBT = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Supersonic, code=SC-2110, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Supersonic, code=SC-2110,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SC_2110 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Supersonic, code=SC_3107, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Supersonic, code=SC_3107,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SC_3107 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Supersonic, code=SC_3110, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Supersonic, code=SC_3110,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val SC_3110 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Supersonic, code=SC-4317BT, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Supersonic, code=SC-4317BT,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SC_4317BT = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Supersonic, code=SC_5310BDL, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Supersonic, code=SC_5310BDL,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val SC_5310BDL = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Supersonic, code=SC_779KT, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Supersonic, code=SC_779KT,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val SC_779KT = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Supersonic, code=SC-813, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Supersonic, code=SC-813,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val SC_813 = "spec:width=1080,height=1920,unit=px,dpi=240"

  }

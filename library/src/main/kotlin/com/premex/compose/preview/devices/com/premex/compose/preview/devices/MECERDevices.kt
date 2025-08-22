package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MECER device specifications for Android Compose previews.
 *
 * This extension provides MECER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MECER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MECER: Any
  get() = object {
      /** DeviceSpec(manufacturer=MECER, code=M17QF6-3Gplus, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECER, code=M17QF6-3Gplus,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val M17QF6_3GPLUS = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MECER, code=M77QF6, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECER, code=M77QF6, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val M77QF6 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MECER, code=MF716, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECER, code=MF716, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MF716 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MECER, code=TF10EA2_11, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECER, code=TF10EA2_11, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TF10EA2_11 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MECER, code=TF10MK1_3, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MECER, code=TF10MK1_3, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TF10MK1_3 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

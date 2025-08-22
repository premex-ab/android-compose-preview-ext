package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NEONIQ device specifications for Android Compose previews.
 *
 * This extension provides NEONIQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NEONIQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NEONIQ: Any
  get() = object {
      /** DeviceSpec(manufacturer=NEONIQ, code=NQT-1013GIQ, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEONIQ, code=NQT-1013GIQ,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val NQT_1013GIQ = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NEONIQ, code=NQT-1014GIQ, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEONIQ, code=NQT-1014GIQ,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val NQT_1014GIQ = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=NEONIQ, code=NQT-1014GIQA, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEONIQ, code=NQT-1014GIQA,
      width=800, height=1280, dpi=220, isGoogleDevice=false).code */
      val NQT_1014GIQA = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=NEONIQ, code=NQT-73GIQ, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEONIQ, code=NQT-73GIQ, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val NQT_73GIQ = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NEONIQ, code=NQT-73GIQ11, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEONIQ, code=NQT-73GIQ11,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val NQT_73GIQ11 = "spec:width=600,height=1024,unit=px,dpi=160"

  }

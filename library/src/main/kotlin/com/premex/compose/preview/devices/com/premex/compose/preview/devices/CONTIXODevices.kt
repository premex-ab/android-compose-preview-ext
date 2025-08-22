package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CONTIXO device specifications for Android Compose previews.
 *
 * This extension provides CONTIXO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CONTIXO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CONTIXO: Any
  get() = object {
      /** DeviceSpec(manufacturer=CONTIXO, code=CONTIXO-V8, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONTIXO, code=CONTIXO-V8,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val CONTIXO_V8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CONTIXO, code=CONTIXO-V9, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONTIXO, code=CONTIXO-V9,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val CONTIXO_V9 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CONTIXO, code=K101A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONTIXO, code=K101A, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K101A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CONTIXO, code=K103, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONTIXO, code=K103, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K103 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CONTIXO, code=K103A, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONTIXO, code=K103A, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K103A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CONTIXO, code=K81, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONTIXO, code=K81, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K81 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CONTIXO, code=V10, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONTIXO, code=V10, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val V10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CONTIXO, code=V10A, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONTIXO, code=V10A, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val V10A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CONTIXO, code=V10S, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONTIXO, code=V10S, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val V10S = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CONTIXO, code=V10X, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONTIXO, code=V10X, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val V10X = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CONTIXO, code=V11, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONTIXO, code=V11, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val V11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=CONTIXO, code=V8X, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONTIXO, code=V8X, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val V8X = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CONTIXO, code=V90, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONTIXO, code=V90, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val V90 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=CONTIXO, code=V9X, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CONTIXO, code=V9X, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val V9X = "spec:width=600,height=1024,unit=px,dpi=160"

  }

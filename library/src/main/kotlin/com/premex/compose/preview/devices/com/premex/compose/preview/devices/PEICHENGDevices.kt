package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PEICHENG device specifications for Android Compose previews.
 *
 * This extension provides PEICHENG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PEICHENG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PEICHENG: Any
  get() = object {
      /** DeviceSpec(manufacturer=PEICHENG, code=Q1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEICHENG, code=Q1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Q1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PEICHENG, code=Q8, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEICHENG, code=Q8, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Q8 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PEICHENG, code=Q8PRO, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEICHENG, code=Q8PRO, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val Q8PRO = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PEICHENG, code=ZB31, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEICHENG, code=ZB31, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ZB31 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PEICHENG, code=ZB32, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PEICHENG, code=ZB32, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val ZB32 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

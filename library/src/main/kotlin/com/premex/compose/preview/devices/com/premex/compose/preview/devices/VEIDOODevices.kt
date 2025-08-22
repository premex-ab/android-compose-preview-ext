package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VEIDOO device specifications for Android Compose previews.
 *
 * This extension provides VEIDOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VEIDOO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VEIDOO: Any
  get() = object {
      /** DeviceSpec(manufacturer=VEIDOO, code=VEIDOO_T30_PLUS, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VEIDOO, code=VEIDOO_T30_PLUS,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val VEIDOO_T30_PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=VEIDOO, code=VEIDOO_T8, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VEIDOO, code=VEIDOO_T8, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val VEIDOO_T8 = "spec:width=600,height=1024,unit=px,dpi=160"

  }

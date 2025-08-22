package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * JOOYON device specifications for Android Compose previews.
 *
 * This extension provides JOOYON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.JOOYON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.JOOYON: Any
  get() = object {
      /** DeviceSpec(manufacturer=JOOYON, code=J110A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JOOYON, code=J110A, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val J110A = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=JOOYON, code=sindorim, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=JOOYON, code=sindorim, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SINDORIM = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

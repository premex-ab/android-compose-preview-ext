package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STYLOS device specifications for Android Compose previews.
 *
 * This extension provides STYLOS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.STYLOS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.STYLOS: Any
  get() = object {
      /** DeviceSpec(manufacturer=STYLOS, code=TAB8B, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLOS, code=TAB8B, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TAB8B = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=STYLOS, code=TAB8F, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLOS, code=TAB8F, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TAB8F = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=STYLOS, code=TARISTAB2, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=STYLOS, code=TARISTAB2, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TARISTAB2 = "spec:width=600,height=1024,unit=px,dpi=160"

  }

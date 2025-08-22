package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Verifone device specifications for Android Compose previews.
 *
 * This extension provides Verifone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Verifone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Verifone: Any
  get() = object {
      /** DeviceSpec(manufacturer=Verifone, code=IX90_CQA1103_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Verifone, code=IX90_CQA1103_EEA,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val IX90_CQA1103_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }

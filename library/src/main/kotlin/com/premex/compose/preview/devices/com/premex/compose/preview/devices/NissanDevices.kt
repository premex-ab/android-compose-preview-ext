package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * nissan device specifications for Android Compose previews.
 *
 * This extension provides nissan device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nissan.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nissan: Any
  get() = object {
      /** DeviceSpec(manufacturer=nissan, code=aivi2_b, width=720, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nissan, code=aivi2_b, width=720,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val AIVI2_B = "spec:width=720,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=nissan, code=aivi2_n_full, width=720, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=nissan, code=aivi2_n_full,
      width=720, height=1920, dpi=160, isGoogleDevice=false).code */
      val AIVI2_N_FULL = "spec:width=720,height=1920,unit=px,dpi=160"

  }

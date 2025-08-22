package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * alpine device specifications for Android Compose previews.
 *
 * This extension provides alpine device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Alpine.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Alpine: Any
  get() = object {
      /** DeviceSpec(manufacturer=alpine, code=aivi2_r_full_dom, width=720, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=alpine, code=aivi2_r_full_dom,
      width=720, height=1280, dpi=160, isGoogleDevice=false).code */
      val AIVI2_R_FULL_DOM = "spec:width=720,height=1280,unit=px,dpi=160"

  }

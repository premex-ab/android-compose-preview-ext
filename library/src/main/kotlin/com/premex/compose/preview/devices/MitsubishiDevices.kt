package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * mitsubishi device specifications for Android Compose previews.
 *
 * This extension provides mitsubishi device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mitsubishi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mitsubishi: Any
  get() = object {
      /** mitsubishi aivi2_r_full_dom */
      val AIVI2_R_FULL_DOM = "spec:width=960,height=1280,unit=px,dpi=160"

  }

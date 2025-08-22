package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CEIBAL device specifications for Android Compose previews.
 *
 * This extension provides CEIBAL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CEIBAL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CEIBAL: Any
  get() = object {
      /** CEIBAL BETELGEUSE */
      val BETELGEUSE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** CEIBAL Kil-82WFDC */
      val KIL_82WFDC = "spec:width=800,height=1280,unit=px,dpi=160"

  }

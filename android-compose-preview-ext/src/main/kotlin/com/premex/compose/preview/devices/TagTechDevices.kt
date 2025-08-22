package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TAG-TECH device specifications for Android Compose previews.
 *
 * This extension provides TAG-TECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TagTech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TagTech: Any
  get() = object {
      /** TAG-TECH TAG_TAB_II */
      val TAG_TAB_II = "spec:width=1200,height=1920,unit=px,dpi=280"

  }

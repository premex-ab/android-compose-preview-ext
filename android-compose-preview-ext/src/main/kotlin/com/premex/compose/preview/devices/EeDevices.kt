package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ee device specifications for Android Compose previews.
 *
 * This extension provides ee device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ee.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ee: Any
  get() = object {
      /** ee harrier_tab */
      val HARRIER_TAB = "spec:width=1200,height=1920,unit=px,dpi=320"

  }

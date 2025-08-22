package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SENSEIT device specifications for Android Compose previews.
 *
 * This extension provides SENSEIT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SENSEIT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SENSEIT: Any
  get() = object {
      /** SENSEIT SENSEIT_A109 */
      val SENSEIT_A109 = "spec:width=480,height=854,unit=px,dpi=240"

  }

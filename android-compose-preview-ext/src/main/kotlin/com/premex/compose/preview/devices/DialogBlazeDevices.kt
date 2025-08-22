package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dialog-Blaze device specifications for Android Compose previews.
 *
 * This extension provides Dialog-Blaze device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DialogBlaze.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DialogBlaze: Any
  get() = object {
      /** Dialog-Blaze M50E-1A */
      val M50E_1A = "spec:width=480,height=854,unit=px,dpi=240"

  }

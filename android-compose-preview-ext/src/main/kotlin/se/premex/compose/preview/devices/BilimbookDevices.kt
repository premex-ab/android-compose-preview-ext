package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * BilimBook device specifications for Android Compose previews.
 *
 * This extension provides BilimBook device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bilimbook.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bilimbook: Any
  get() = object {
      /** BilimBook BilimBook_mini */
      val BILIMBOOK_MINI = "spec:width=800,height=1280,unit=px,dpi=213"

  }

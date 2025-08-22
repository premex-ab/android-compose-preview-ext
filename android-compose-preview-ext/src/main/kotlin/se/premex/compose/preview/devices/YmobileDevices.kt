package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Ymobile device specifications for Android Compose previews.
 *
 * This extension provides Ymobile device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ymobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ymobile: Any
  get() = object {
      /** Ymobile P450A01 */
      val P450A01 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }

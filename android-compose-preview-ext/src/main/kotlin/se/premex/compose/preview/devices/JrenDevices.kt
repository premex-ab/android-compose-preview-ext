package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * jren device specifications for Android Compose previews.
 *
 * This extension provides jren device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jren.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jren: Any
  get() = object {
      /** jren JR-J8 */
      val JR_J8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }

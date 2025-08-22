package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Innocn device specifications for Android Compose previews.
 *
 * This extension provides Innocn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Innocn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Innocn: Any
  get() = object {
      /** Innocn YUL */
      val YUL = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * HOFFMANN device specifications for Android Compose previews.
 *
 * This extension provides HOFFMANN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hoffmann.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hoffmann: Any
  get() = object {
      /** HOFFMANN X-Go */
      val X_GO = "spec:width=720,height=1280,unit=px,dpi=320"

  }

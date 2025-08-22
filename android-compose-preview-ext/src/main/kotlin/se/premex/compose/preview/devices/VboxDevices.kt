package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * VBox device specifications for Android Compose previews.
 *
 * This extension provides VBox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vbox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vbox: Any
  get() = object {
      /** VBox DTP9539 */
      val DTP9539 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

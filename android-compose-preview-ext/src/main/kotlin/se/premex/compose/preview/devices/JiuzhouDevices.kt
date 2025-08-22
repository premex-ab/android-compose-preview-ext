package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Jiuzhou device specifications for Android Compose previews.
 *
 * This extension provides Jiuzhou device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jiuzhou.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jiuzhou: Any
  get() = object {
      /** Jiuzhou DTP9503 */
      val DTP9503 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

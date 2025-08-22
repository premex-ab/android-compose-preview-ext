package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Shortcut device specifications for Android Compose previews.
 *
 * This extension provides Shortcut device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Shortcut.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Shortcut: Any
  get() = object {
      /** Shortcut dwt765ltt */
      val DWT765LTT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

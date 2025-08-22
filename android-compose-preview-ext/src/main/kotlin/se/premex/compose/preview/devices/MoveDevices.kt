package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Move device specifications for Android Compose previews.
 *
 * This extension provides Move device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Move.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Move: Any
  get() = object {
      /** Move DV8919-KSM */
      val DV8919_KSM = "spec:width=720,height=1280,unit=px,dpi=320"

  }

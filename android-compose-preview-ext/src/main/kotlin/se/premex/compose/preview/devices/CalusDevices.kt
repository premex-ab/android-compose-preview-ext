package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CALUS device specifications for Android Compose previews.
 *
 * This extension provides CALUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Calus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Calus: Any
  get() = object {
      /** CALUS Note_16_Pro */
      val NOTE_16_PRO = "spec:width=720,height=1640,unit=px,dpi=320"

  }

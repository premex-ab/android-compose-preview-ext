package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Mobily device specifications for Android Compose previews.
 *
 * This extension provides Mobily device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mobily.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mobily: Any
  get() = object {
      /** Mobily qnbml */
      val QNBML = "spec:width=720,height=1280,unit=px,dpi=213"

  }

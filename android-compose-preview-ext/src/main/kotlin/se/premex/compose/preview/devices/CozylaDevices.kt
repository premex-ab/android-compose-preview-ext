package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Cozyla device specifications for Android Compose previews.
 *
 * This extension provides Cozyla device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cozyla.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cozyla: Any
  get() = object {
      /** Cozyla Calendar */
      val CALENDAR = "spec:width=1080,height=1920,unit=px,dpi=240"

  }

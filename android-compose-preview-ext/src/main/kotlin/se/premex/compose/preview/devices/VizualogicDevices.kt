package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Vizualogic device specifications for Android Compose previews.
 *
 * This extension provides Vizualogic device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vizualogic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vizualogic: Any
  get() = object {
      /** Vizualogic Q83 */
      val Q83 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }

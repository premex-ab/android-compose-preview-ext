package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Fortus device specifications for Android Compose previews.
 *
 * This extension provides Fortus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fortus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fortus: Any
  get() = object {
      /** Fortus PayTab_PT10 */
      val PAYTAB_PT10 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }

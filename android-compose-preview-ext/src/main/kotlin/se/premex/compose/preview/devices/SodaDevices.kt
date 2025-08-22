package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * soda device specifications for Android Compose previews.
 *
 * This extension provides soda device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Soda.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Soda: Any
  get() = object {
      /** soda Note_12 */
      val NOTE_12 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** soda Note_12Pro */
      val NOTE_12PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** soda ROCK_30 */
      val ROCK_30 = "spec:width=720,height=1612,unit=px,dpi=320"

  }

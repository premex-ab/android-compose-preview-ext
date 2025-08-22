package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * NAVCITY device specifications for Android Compose previews.
 *
 * This extension provides NAVCITY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Navcity.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Navcity: Any
  get() = object {
      /** NAVCITY NP752 */
      val NP752 = "spec:width=480,height=854,unit=px,dpi=240"

      /** NAVCITY NP-752Go */
      val NP_752GO = "spec:width=480,height=854,unit=px,dpi=240"

  }

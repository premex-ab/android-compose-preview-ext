package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DEYI device specifications for Android Compose previews.
 *
 * This extension provides DEYI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Deyi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Deyi: Any
  get() = object {
      /** DEYI DEYI10M18A53 */
      val DEYI10M18A53 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DEYI DEYI-10M18 */
      val DEYI_10M18 = "spec:width=800,height=1280,unit=px,dpi=213"

  }

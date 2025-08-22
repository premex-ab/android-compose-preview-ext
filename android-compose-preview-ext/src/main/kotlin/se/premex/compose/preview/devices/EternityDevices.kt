package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ETERNITY device specifications for Android Compose previews.
 *
 * This extension provides ETERNITY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Eternity.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Eternity: Any
  get() = object {
      /** ETERNITY HEROSP001 */
      val HEROSP001 = "spec:width=480,height=854,unit=px,dpi=240"

      /** ETERNITY UWS68 */
      val UWS68 = "spec:width=720,height=1600,unit=px,dpi=320"

  }

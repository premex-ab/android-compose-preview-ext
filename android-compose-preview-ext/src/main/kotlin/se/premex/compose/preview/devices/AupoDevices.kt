package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AUPO device specifications for Android Compose previews.
 *
 * This extension provides AUPO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Aupo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Aupo: Any
  get() = object {
      /** AUPO AUPO_Zeus_10_Pro */
      val AUPO_ZEUS_10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** AUPO AUPO_Zeus_10_Pro_ROW */
      val AUPO_ZEUS_10_PRO_ROW = "spec:width=800,height=1280,unit=px,dpi=213"

  }

package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Dicle_Tab device specifications for Android Compose previews.
 *
 * This extension provides Dicle_Tab device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DicleTab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DicleTab: Any
  get() = object {
      /** Dicle_Tab Active */
      val ACTIVE = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Dicle_Tab DTABC2 */
      val DTABC2 = "spec:width=800,height=1280,unit=px,dpi=213"

  }

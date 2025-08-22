package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PN_RAVEC device specifications for Android Compose previews.
 *
 * This extension provides PN_RAVEC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PnRavec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PnRavec: Any
  get() = object {
      /** PN_RAVEC PN_RAVEC_TABLETTE */
      val PN_RAVEC_TABLETTE = "spec:width=1200,height=1920,unit=px,dpi=240"

  }

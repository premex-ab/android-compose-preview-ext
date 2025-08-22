package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * XGIMI device specifications for Android Compose previews.
 *
 * This extension provides XGIMI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xgimi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xgimi: Any
  get() = object {
      /** XGIMI altai */
      val ALTAI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** XGIMI xgimiapollo */
      val XGIMIAPOLLO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** XGIMI xgimigalileo */
      val XGIMIGALILEO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }

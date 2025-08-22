package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * elevn device specifications for Android Compose previews.
 *
 * This extension provides elevn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Elevn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Elevn: Any
  get() = object {
      /** elevn elevn_eTab */
      val ELEVN_ETAB = "spec:width=1200,height=1920,unit=px,dpi=280"

  }

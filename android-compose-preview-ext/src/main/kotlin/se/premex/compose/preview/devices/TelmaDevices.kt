package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TELMA device specifications for Android Compose previews.
 *
 * This extension provides TELMA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Telma.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Telma: Any
  get() = object {
      /** TELMA EGO_plus */
      val EGO_PLUS = "spec:width=480,height=996,unit=px,dpi=240"

      /** TELMA TELMA_IFEEL_MAX */
      val TELMA_IFEEL_MAX = "spec:width=480,height=854,unit=px,dpi=240"

  }

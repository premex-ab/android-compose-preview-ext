package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * E-LEAD device specifications for Android Compose previews.
 *
 * This extension provides E-LEAD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ELead.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ELead: Any
  get() = object {
      /** E-LEAD RSE */
      val RSE = "spec:width=1080,height=1920,unit=px,dpi=240"

  }

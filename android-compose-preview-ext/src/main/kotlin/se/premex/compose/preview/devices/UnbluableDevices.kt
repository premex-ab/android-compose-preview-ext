package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Unbluable device specifications for Android Compose previews.
 *
 * This extension provides Unbluable device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Unbluable.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Unbluable: Any
  get() = object {
      /** Unbluable PaperTablet */
      val PAPERTABLET = "spec:width=768,height=1024,unit=px,dpi=160"

  }

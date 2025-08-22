package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Intelkom device specifications for Android Compose previews.
 *
 * This extension provides Intelkom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Intelkom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Intelkom: Any
  get() = object {
      /** Intelkom meanIT_C10C11 */
      val MEANIT_C10C11 = "spec:width=800,height=1280,unit=px,dpi=160"

  }

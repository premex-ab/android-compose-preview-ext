package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * KANSELIR device specifications for Android Compose previews.
 *
 * This extension provides KANSELIR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kanselir.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kanselir: Any
  get() = object {
      /** KANSELIR KTB-168 */
      val KTB_168 = "spec:width=800,height=1280,unit=px,dpi=213"

  }

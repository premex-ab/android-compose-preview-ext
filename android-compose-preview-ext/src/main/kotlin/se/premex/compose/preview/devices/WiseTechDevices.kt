package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Wise_Tech device specifications for Android Compose previews.
 *
 * This extension provides Wise_Tech device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.WiseTech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.WiseTech: Any
  get() = object {
      /** Wise_Tech Tech_A1_Plus */
      val TECH_A1_PLUS = "spec:width=800,height=1280,unit=px,dpi=213"

  }

package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CHEMIST_WAREHOUSE device specifications for Android Compose previews.
 *
 * This extension provides CHEMIST_WAREHOUSE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ChemistWarehouse.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ChemistWarehouse: Any
  get() = object {
      /** CHEMIST_WAREHOUSE JR_MB603 */
      val JR_MB603 = "spec:width=720,height=1280,unit=px,dpi=320"

  }

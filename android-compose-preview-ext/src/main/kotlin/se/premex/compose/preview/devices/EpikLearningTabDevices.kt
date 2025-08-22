package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * EPIK_Learning_Tab device specifications for Android Compose previews.
 *
 * This extension provides EPIK_Learning_Tab device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EpikLearningTab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EpikLearningTab: Any
  get() = object {
      /** EPIK_Learning_Tab ELT0801 */
      val ELT0801 = "spec:width=800,height=1280,unit=px,dpi=213"

  }

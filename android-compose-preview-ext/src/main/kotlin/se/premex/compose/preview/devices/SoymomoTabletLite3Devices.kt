package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * SoyMomo_Tablet_LITE_3 device specifications for Android Compose previews.
 *
 * This extension provides SoyMomo_Tablet_LITE_3 device specifications that can be used with
 * @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SoymomoTabletLite3.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SoymomoTabletLite3: Any
  get() = object {
      /** SoyMomo_Tablet_LITE_3 SoyMomo_Lite_V3 */
      val SOYMOMO_LITE_V3 = "spec:width=600,height=1024,unit=px,dpi=160"

  }

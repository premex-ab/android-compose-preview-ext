package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ANS device specifications for Android Compose previews.
 *
 * This extension provides ANS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ans.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ans: Any
  get() = object {
      /** ANS L50 */
      val L50 = "spec:width=480,height=854,unit=px,dpi=240"

      /** ANS L51 */
      val L51 = "spec:width=480,height=854,unit=px,dpi=240"

      /** ANS UL40 */
      val UL40 = "spec:width=480,height=800,unit=px,dpi=240"

  }

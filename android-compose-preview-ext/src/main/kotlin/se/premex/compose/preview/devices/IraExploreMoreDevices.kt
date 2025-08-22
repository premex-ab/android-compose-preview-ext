package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * IRA_explore_more device specifications for Android Compose previews.
 *
 * This extension provides IRA_explore_more device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IraExploreMore.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IraExploreMore: Any
  get() = object {
      /** IRA_explore_more IRA_BHARATAB_1021 */
      val IRA_BHARATAB_1021 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
